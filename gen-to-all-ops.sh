#!/bin/sh

function generate() {
NAME=$1
cat << EOS
package com.github.j5ik2o.reactive.aws.${NAME}.model.ops

import com.github.j5ik2o.reactive.aws.utils.ToOptionSupport

trait ToAllOps
EOS

ls reactive-aws-${NAME}/core/src/main/scala/com/github/j5ik2o/reactive/aws/${NAME}/model/ops | grep -v 'ToAllOps.scala' | grep -v 'package.scala' | sed -e 's/\.scala//g' | sed -e 's/^/ with To/g' | sed -e '1,1s/ with /extends ToOptionSupport with /'
}

for NAME in $(find . -type d -maxdepth 1 | grep "reactive" | sed -e 's/\.\/reactive-aws-//g' | grep -v "common")
do
    echo "reactive-aws-${NAME}/core/src/main/scala/com/github/j5ik2o/reactive/aws/${NAME}/model/ops/ToAllOps.scala"
    generate $NAME > reactive-aws-${NAME}/core/src/main/scala/com/github/j5ik2o/reactive/aws/${NAME}/model/ops/ToAllOps.scala
done
