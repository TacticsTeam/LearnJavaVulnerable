# pip install pycrypto
import sys
import base64
from Crypto.Cipher import AES
def decode_rememberme_file(filename):
    with open(filename, 'rb') as fpr:
        key  =  "kPH+bIxk5D2deZiIxcaaaA=="
        mode =  AES.MODE_CBC
        IV   = b' ' * 16
        encryptor = AES.new(base64.b64decode(key), mode, IV=IV)
        remember_bin = encryptor.decrypt(fpr.read())
    return remember_bin
if __name__ == '__main__':
    with open("/tmp/decrypt.bin", 'wb+') as fpw:
        fpw.write(decode_rememberme_file(sys.argv[1]))