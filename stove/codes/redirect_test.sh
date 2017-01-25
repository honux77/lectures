#!/bin/bash
err() { echo $@ 1>&2; }
echo "stdout"
err "stderr"
