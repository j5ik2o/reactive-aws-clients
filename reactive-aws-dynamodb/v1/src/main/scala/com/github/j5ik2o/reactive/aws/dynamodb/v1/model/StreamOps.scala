// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Stream => ScalaStream, _ }
import com.amazonaws.services.dynamodbv2.model.{ Stream => JavaStream }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamOps {

  implicit class ScalaStreamOps(val self: ScalaStream) extends AnyVal {

    def toJava: JavaStream = {
      val result = new JavaStream()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.withStreamArn(v))     // String
      self.tableName.filter(_.nonEmpty).foreach(v => result.withTableName(v))     // String
      self.streamLabel.filter(_.nonEmpty).foreach(v => result.withStreamLabel(v)) // String

      result
    }

  }

  implicit class JavaStreamOps(val self: JavaStream) extends AnyVal {

    def toScala: ScalaStream = {
      ScalaStream()
        .withStreamArn(Option(self.getStreamArn)) // String
        .withTableName(Option(self.getTableName)) // String
        .withStreamLabel(Option(self.getStreamLabel)) // String
    }

  }

}
