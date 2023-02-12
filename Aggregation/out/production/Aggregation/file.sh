#!/bin/bash
echo "Enter  a number"
read number

if [ $number -gt 0 ]; then
    if [ $((number%2)) -eq 0 ]; then
      echo "the number is even"

    else
      echo "the number is odd"
    fi
else
  echo "try a positive number"
fi