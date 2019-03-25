package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ Stream => ScalaStream, _ }
import software.amazon.awssdk.services.dynamodb.model.{ Stream => JavaStream }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object StreamOps {

  implicit class ScalaStreamOps(val self: ScalaStream) extends AnyVal {

    def toJava: JavaStream = {
      val result = JavaStream.builder()
      self.streamArn.filter(_.nonEmpty).foreach(v => result.streamArn(v))     // String
      self.tableName.filter(_.nonEmpty).foreach(v => result.tableName(v))     // String
      self.streamLabel.filter(_.nonEmpty).foreach(v => result.streamLabel(v)) // String

      result.build()
    }

  }

  implicit class JavaStreamOps(val self: JavaStream) extends AnyVal {

    def toScala: ScalaStream = {
      ScalaStream()
        .withStreamArn(Option(self.streamArn)) // String
        .withTableName(Option(self.tableName)) // String
        .withStreamLabel(Option(self.streamLabel)) // String
    }

  }

}
