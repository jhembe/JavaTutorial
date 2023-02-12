name="John";
echo $name;
echo "$name"
echo '$name'
echo ${name}

echo '$ping 192.168.1.4 $grep 456'

fruits=("apple" "banana" "cherry" "mangoes");
echo ${fruits[1]};
fruits[2]=Avocado;
echo  ${fruits[2]}
echo ${#fruits}

for ((i=1;i<=${#fruits};i++)); do
  echo ${fruits[i]};
done

for tunda in $fruits; do
  echo $tunda
done

for tunda in embe parachichi nanasi chungwa; do
  echo $tunda;
done

#for i in {50..100}; do
#  echo $i
#done
#
#for ((i=50;i<=100;i++)); do
#  echo $i;
#done
##echo $fruits


count=0
until [ $count -gt 9 ]; do
  count=$(($count + 1))
  echo $count
done

#do{
#  echo "FGHJKL";
#  count=$(($count + 1))
#}
#while [ $count -lt 10 ]; do
#
#done

for (( ; ; )); do
    echo "Infinite"
done