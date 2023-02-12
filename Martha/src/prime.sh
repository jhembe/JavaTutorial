# shellcheck disable=SC1073
for a in 2 3 4 5 6 7 8 9 10 11 13
do
  isPrime=1
  for (( i = 0; i < a/2; i++ )); do
      if [ $((a%i)) -eq 0 ]; then
          isPrime=0
          break
      fi
  done
  if [ $isPrime -eq 1 ]; then
      echo "$a is a prime number"
  fi
done
