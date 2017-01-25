#!/bin/bash
NUM=0
for i in $@
do
	echo $NUM - $i
	NUM=$(($NUM+1))
done
