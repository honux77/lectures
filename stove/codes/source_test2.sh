#!/bin/bash

if [ ! -d $HOME/temp ]
then
	echo "create $HOME/temp"
	mkdir $HOME/temp
fi

cd $HOME/temp
echo "Current directory: $PWD"
echo "Bye~"
