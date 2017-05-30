#!/bin/zsh

FILE=1-1.md
if [ $# -ne 1 ]; then 
	echo "Usage: $0 foldername"
	exit 1
else
	DIRNAME=$1
fi

if [ -e $1 ]; then
	echo "$1 exist"
	exit 1
fi

cp -a template $DIRNAME
echo "Done"
