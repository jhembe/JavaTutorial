#!/usr/bin/zsh

echo -n "Enter a file to be copied : ";
read filename;

if [ -f "$filename" ]; then
  cp "./$filename" test/
  exit 0
else
  echo "File not found !!"
fi