#!/bin/bash

folder=$1

#check if a folder was provided as an argument
#

if [ -z "$folder" ]; then
	echo "Error: Please provide a folder to search as an argument"
	exit 1
fi

## now check if the provided folder exists
#
if [ ! -d "$folder" ]; then
	echo "Error: The provided folder does not exist"
	exit 1
fi

#using the find command to search for the files with *.tiff extension

for file in "$folder"/*.pdf; do
       echo "$file"
       break
done
