#!/usr/bin/zsh

echo -n "Enter the starting value : ";
read m;

echo -n "Enter the Ending value : ";
read n;

for a in {$m..$n}; do
  for ((i=1;i<=a/2;i++)); do
    if [ $((a%i)) -eq 0 ]; then
      count=$((count + 1))
    fi
  done
  if [ $count -le 1 ]; then
    echo "$a is PRIME";
  else
    echo "$a NOT PRIME"
  fi
  count=0;
done