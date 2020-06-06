# pip install pycrypto
import sys
import base64
from Crypto.Cipher import AES


# def decode_rememberme_file(filename):
#     with open(filename, 'rb') as fpr:
#         key = "kPH+bIxk5D2deZiIxcaaaA=="
#         mode = AES.MODE_CBC
#         IV = b' ' * 16
#         encryptor = AES.new(base64.b64decode(key), mode, IV=IV)
#         remember_bin = encryptor.decrypt(fpr.read())
#     return remember_bin


# if __name__ == '__main__':
#     with open("/tmp/decrypt.bin", 'wb+') as fpw:
#         fpw.write(decode_rememberme_file(sys.argv[1]))


enc = '''
b5yZT61fKmL1xtrbaea+J69nQ/3CTtCs6JjKpkASJVL9LKgHtt3poOgXuYgOgyTEevaxzGEwqBUSi/GQG7oTlZdqTsyE5ZgdmhGtcFmuYlAg/o3pIpsHqOoceaMJ9EY4C7int+hb23KChqj73Mm99EMeb7Ey8jD6L4f1gJHjYKTv+ORbKQIaP6Num6MaXTBoYVloPRk8Lm2V+FNaksUkG949JQlvxtWIj1lidEXzjZ1GhA5nPrB5oR+3cb0mLBcg4UDyU3kqvIYKyfBhCe3BFBB1WySgNRFT5Ta4ybIirFGwdG6Ibhb55u1yZd+O1cC/Oc24qiJ2rkuXSLRZT4+0OtAlETaJQq3Is0AAiGwsCR1wuXsT2xxZA1t+lzP3yluW/46LaNlNLwIQLedNOHo1E+7BMbDf8yAabQqWSENW1JvmXB+fjsdSplj/YKFDNDKONn8JhynJhQnsaK+fv48Z/Tc+yNwzeChVp4cMHNyLsuGtJaoyZD3M5BDz0bmXDKTU  
'''
key = "kPH+bIxk5D2deZiIxcaaaA=="
mode = AES.MODE_CBC
IV = b' ' * 16
encryptor = AES.new(base64.b64decode(key), mode, IV=IV)
remember_bin = encryptor.decrypt(base64.b64decode(enc))
print(remember_bin)
