// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.v2.model

import com.github.j5ik2o.reactive.aws.dynamodb.model.{ SourceTableFeatureDetails => ScalaSourceTableFeatureDetails, _ }
import software.amazon.awssdk.services.dynamodb.model.{ SourceTableFeatureDetails => JavaSourceTableFeatureDetails }

@SuppressWarnings(Array("org.wartremover.warts.Recursion"))
object SourceTableFeatureDetailsOps {

  implicit class ScalaSourceTableFeatureDetailsOps(val self: ScalaSourceTableFeatureDetails) extends AnyVal {

    def toJava: JavaSourceTableFeatureDetails = {
      val result = JavaSourceTableFeatureDetails.builder()
      self.localSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, LocalSecondaryIndexInfoOps._;
        result.localSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[LocalSecondaryIndexInfo]
      self.globalSecondaryIndexes.filter(_.nonEmpty).foreach { v =>
        import scala.collection.JavaConverters._, GlobalSecondaryIndexInfoOps._;
        result.globalSecondaryIndexes(v.map(_.toJava).asJava)
      } // Seq[GlobalSecondaryIndexInfo]
      self.streamDescription.foreach { v =>
        import StreamSpecificationOps._; result.streamDescription(v.toJava)
      } // StreamSpecification
      self.timeToLiveDescription.foreach { v =>
        import TimeToLiveDescriptionOps._; result.timeToLiveDescription(v.toJava)
      } // TimeToLiveDescription
      self.sseDescription.foreach { v =>
        import SSEDescriptionOps._; result.sseDescription(v.toJava)
      } // SSEDescription

      result.build()
    }

  }

  implicit class JavaSourceTableFeatureDetailsOps(val self: JavaSourceTableFeatureDetails) extends AnyVal {

    def toScala: ScalaSourceTableFeatureDetails = {
      ScalaSourceTableFeatureDetails()
        .withLocalSecondaryIndexes(Option(self.localSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, LocalSecondaryIndexInfoOps._; v.asScala.map(_.toScala)
        }) // Seq[LocalSecondaryIndexInfo]
        .withGlobalSecondaryIndexes(Option(self.globalSecondaryIndexes).map { v =>
          import scala.collection.JavaConverters._, GlobalSecondaryIndexInfoOps._; v.asScala.map(_.toScala)
        }) // Seq[GlobalSecondaryIndexInfo]
        .withStreamDescription(Option(self.streamDescription).map { v =>
          import StreamSpecificationOps._; v.toScala
        }) // StreamSpecification
        .withTimeToLiveDescription(Option(self.timeToLiveDescription).map { v =>
          import TimeToLiveDescriptionOps._; v.toScala
        }) // TimeToLiveDescription
        .withSseDescription(Option(self.sseDescription).map { v =>
          import SSEDescriptionOps._; v.toScala
        }) // SSEDescription
    }

  }

}
