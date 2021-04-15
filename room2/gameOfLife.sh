#!/usr/bin/env bash
set -e

xyStr='
    1,1
    2,2
    3,3
'

xyPosition() {
    xyArr=( $xyStr )
    x=$(cut -d, -f1 <<< ${xyArr[$1]})
    y=$(cut -d, -f2 <<< ${xyArr[$1]})
    echo -e "$x\n$y"
}

xyPosition 1