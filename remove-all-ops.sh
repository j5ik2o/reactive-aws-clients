#/bin/sh

for NAME in $(find . -type d -maxdepth 1 | grep "reactive" | sed -e 's/\.\/reactive-aws-//g' | grep -v "common")
do
  for F in $(ls reactive-aws-${NAME}/core/src/main/scala/com/github/j5ik2o/reactive/aws/${NAME}/model/ops | grep -v 'ToAllOps.scala' | grep -v 'package.scala')
  do
    rm reactive-aws-${NAME}/core/src/main/scala/com/github/j5ik2o/reactive/aws/${NAME}/model/ops/${F}
  done
done