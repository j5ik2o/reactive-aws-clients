package com.github.j5ik2o.reactive.aws.dynamodb.model.v1
import com.amazonaws.services.dynamodbv2.model.{ DeleteTableResult => JavaDeleteTableResponse }
import com.github.j5ik2o.reactive.aws.dynamodb.model.{ DeleteTableResponse => ScalaDeleteTableResponse }

import scala.collection.JavaConverters._
object DeleteTableResponseOps {

  import TableDescriptionOps._

  implicit class ScalaDeleteTableResponseOps(val self: ScalaDeleteTableResponse) extends AnyVal {

    def toJava: JavaDeleteTableResponse = {
      val result = new JavaDeleteTableResponse()
      self.tableDescription.map(_.toJava).foreach(result.setTableDescription)
      result
    }

  }

  implicit class JavaDeleteTableResponseOps(val self: JavaDeleteTableResponse) extends AnyVal {

    def toScala: ScalaDeleteTableResponse = {
      ScalaDeleteTableResponse()
        .withStatusCode(Option(self.getSdkHttpMetadata).map(_.getHttpStatusCode))
        .withHttpHeaders(Option(self.getSdkHttpMetadata).map(_.getHttpHeaders).map(_.asScala.toMap.mapValues(Seq(_))))
        .withTableDescription(Option(self.getTableDescription).map(_.toScala))
    }

  }

}
