package com.github.j5ik2o.reactive.aws.dynamodb.model.v2

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SourceTableFeatureDetails => ScalaSourceTableFeatureDetails }
import software.amazon.awssdk.services.dynamodb.model.{ SourceTableFeatureDetails => JavaSourceTableFeatureDetails }

import scala.collection.JavaConverters._

object SourceTableFeatureDetailsOps {

  import GlobalSecondaryIndexInfoOps._
  import LocalSecondaryIndexInfoOps._
  import SSEDescriptionOps._
  import StreamSpecificationOps._

  implicit class ScalaSourceTableFeatureDetailsOps(val self: ScalaSourceTableFeatureDetails) extends AnyVal {

    def toJava: JavaSourceTableFeatureDetails = {
      val result = JavaSourceTableFeatureDetails.builder()
      self.localSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.localSecondaryIndexes)
      self.globalSecondaryIndexes.map(_.map(_.toJava).asJava).foreach(result.globalSecondaryIndexes)
      self.streamDescription.map(_.toJava).foreach(result.streamDescription)
      self.sseDescription.map(_.toJava).foreach(result.sseDescription)
      result.build()
    }

  }

  implicit class JavaSourceTableFeatureDetailsOps(val self: JavaSourceTableFeatureDetails) extends AnyVal {
    def toScala: ScalaSourceTableFeatureDetails = {
      ScalaSourceTableFeatureDetails()
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map(_.asScala.map(_.toScala)))
        .withStreamDescription(Option(self.streamDescription).map(_.toScala))
        .withSseDescription(Option(self.sseDescription).map(_.toScala))
    }

  }

}
