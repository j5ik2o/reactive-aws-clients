package com.github.j5ik2o.reactive.dynamodb.model.v1

import com.amazonaws.services.dynamodbv2.model.{ SourceTableFeatureDetails => JavaSourceTableFeatureDetails }
import com.github.j5ik2o.reactive.dynamodb.model.{ SourceTableFeatureDetails => ScalaSourceTableFeatureDetails }

import scala.collection.JavaConverters._

object SourceTableFeatureDetailsOps {

  import GlobalSecondaryIndexInfoOps._
  import LocalSecondaryIndexInfoOps._
  import SSEDescriptionOps._
  import StreamSpecificationOps._

  implicit class ScalaSourceTableFeatureDetailsOps(val self: ScalaSourceTableFeatureDetails) extends AnyVal {

    def toJava: JavaSourceTableFeatureDetails = {
      val result = new JavaSourceTableFeatureDetails()
      self.localSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.setLocalSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.setGlobalSecondaryIndexes)
      self.streamDescription.map(_.toJava).foreach(result.setStreamDescription)
      self.sseDescription.map(_.toJava).foreach(result.setSSEDescription)
      result
    }

  }

  implicit class JavaSourceTableFeatureDetailsOps(val self: JavaSourceTableFeatureDetails) extends AnyVal {
    def toScala: ScalaSourceTableFeatureDetails = {
      ScalaSourceTableFeatureDetails()
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withStreamDescription(Option(self.getStreamDescription).map(_.toScala))
        .withSSEDescription(Option(self.getSSEDescription).map(_.toScala))
    }

  }

}
