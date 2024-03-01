now_h,now_m,now_s = map(int,input().split(":"))
salt_h,salt_m,salt_s = map(int,input().split(":"))
total_now = now_h*(3600) + now_m *(60) + now_s
total_salt = salt_h*(3600) + salt_m *(60) + salt_s

if total_now >= total_salt:
    total_salt+= 86400

total_salt = total_salt-total_now
result_h = total_salt//3600
total_salt = total_salt%3600
result_m = total_salt//60
result_s = total_salt%60


print(str(result_h).zfill(2),str(result_m).zfill(2),str(result_s).zfill(2),sep=':')