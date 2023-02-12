#!/usr/bin/zsh

echo -n "Enter a number : "
read num;

sum=0;
temp=$num;

while [ "$num" -gt 0 ]; do
  rem=$((num%10))
  sum=$(((sum*10)+rem))
  num=$((num/10))
done

echo $sum

if [ $temp -eq $sum ]; then
  echo "The number is Palindrome";
else
  echo "Not Palindrome";
fi