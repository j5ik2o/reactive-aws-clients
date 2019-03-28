// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v1.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SourceTableFeatureDetails => ScalaSourceTableFeatureDetails, _ }
import com.amazonaws.services.dynamodbv2.model.{ SourceTableFeatureDetails => JavaSourceTableFeatureDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SourceTableFeatureDetailsOps {

  implicit class ScalaSourceTableFeatureDetailsOps(val self: ScalaSourceTableFeatureDetails) extends AnyVal {

    def toJava: JavaSourceTableFeatureDetails = {
      val result = new JavaSourceTableFeatureDetails()
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LocalSecondaryIndexInfoOps._;
        result.withLocalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[LocalSecondaryIndexInfo]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexInfoOps._;
        result.withGlobalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndexInfo]
      self.streamDescription.foreach { v =>
        import StreamSpecificationOps._; result.withStreamDescription(v.toJava)
      } // StreamSpecification
      self.timeToLiveDescription.foreach { v =>
        import TimeToLiveDescriptionOps._; result.withTimeToLiveDescription(v.toJava)
      } // TimeToLiveDescription
      self.sseDescription.foreach { v =>
        import SSEDescriptionOps._; result.withSSEDescription(v.toJava)
      } // SSEDescription

      result
    }

  }

  implicit class JavaSourceTableFeatureDetailsOps(val self: JavaSourceTableFeatureDetails) extends AnyVal {

    def toScala: ScalaSourceTableFeatureDetails = {
      ScalaSourceTableFeatureDetails()
        .withLocalSecondaryIndexes(Option(self.getLocalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, LocalSecondaryIndexInfoOps._; v.asScala.map(_.toScala)
        }) // Seq[LocalSecondaryIndexInfo]
        .withGlobalSecondaryIndexes(Option(self.getGlobalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, GlobalSecondaryIndexInfoOps._; v.asScala.map(_.toScala)
        }) // Seq[GlobalSecondaryIndexInfo]
        .withStreamDescription(Option(self.getStreamDescription).map { v =>
          import StreamSpecificationOps._; v.toScala
        }) // StreamSpecification
        .withTimeToLiveDescription(Option(self.getTimeToLiveDescription).map { v =>
          import TimeToLiveDescriptionOps._; v.toScala
        }) // TimeToLiveDescription
        .withSseDescription(Option(self.getSSEDescription).map { v =>
          import SSEDescriptionOps._; v.toScala
        }) // SSEDescription
    }

  }

}
