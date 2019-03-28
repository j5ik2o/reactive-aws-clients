// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeyType => ScalaKeyType, _ }
import com.amazonaws.services.dynamodbv2.model.{ KeyType => JavaKeyType }

object KeyTypeOps {

  implicit class ScalaKeyTypeOps(val self: ScalaKeyType) extends AnyVal {

    def toJava: JavaKeyType = {
      JavaKeyType.valueOf(self.entryName)
    }

  }

  implicit class JavaKeyTypeOps(val self: String) extends AnyVal {

    def toScala: ScalaKeyType = {
      ScalaKeyType.withName(self)
    }

  }

}
