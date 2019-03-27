// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ KeyType => ScalaKeyType, _ }
import software.amazon.awssdk.services.dynamodb.model.{ KeyType => JavaKeyType }

object KeyTypeOps {

  implicit class ScalaKeyTypeOps(val self: ScalaKeyType) extends AnyVal {

    def toJava: JavaKeyType = {
      JavaKeyType.valueOf(self.entryName)
    }

  }

  implicit class JavaKeyTypeOps(val self: JavaKeyType) extends AnyVal {

    def toScala: ScalaKeyType = {
      ScalaKeyType.withName(self.toString)
    }

  }

}
