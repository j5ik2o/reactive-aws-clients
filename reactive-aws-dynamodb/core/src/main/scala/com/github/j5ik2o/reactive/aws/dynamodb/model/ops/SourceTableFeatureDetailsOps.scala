// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SourceTableFeatureDetailsBuilderOps(val self: SourceTableFeatureDetails.Builder) extends AnyVal {

  final def localSecondaryIndexesAsScala(
      value: Option[Seq[LocalSecondaryIndexInfo]]
  ): SourceTableFeatureDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.localSecondaryIndexes(v.asJava)
    }
  }

  final def globalSecondaryIndexesAsScala(
      value: Option[Seq[GlobalSecondaryIndexInfo]]
  ): SourceTableFeatureDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.globalSecondaryIndexes(v.asJava)
    }
  }

  final def streamDescriptionAsScala(value: Option[StreamSpecification]): SourceTableFeatureDetails.Builder = {
    value.fold(self) { v =>
      self.streamDescription(v)
    }
  }

  final def timeToLiveDescriptionAsScala(value: Option[TimeToLiveDescription]): SourceTableFeatureDetails.Builder = {
    value.fold(self) { v =>
      self.timeToLiveDescription(v)
    }
  }

  final def sseDescriptionAsScala(value: Option[SSEDescription]): SourceTableFeatureDetails.Builder = {
    value.fold(self) { v =>
      self.sseDescription(v)
    }
  }

}

final class SourceTableFeatureDetailsOps(val self: SourceTableFeatureDetails) extends AnyVal {

  final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndexInfo]] =
    Option(self.localSecondaryIndexes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndexInfo]] =
    Option(self.globalSecondaryIndexes).map { v =>
      import scala.collection.JavaConverters._; v.asScala
    }

  final def streamDescriptionAsScala: Option[StreamSpecification] = Option(self.streamDescription)

  final def timeToLiveDescriptionAsScala: Option[TimeToLiveDescription] = Option(self.timeToLiveDescription)

  final def sseDescriptionAsScala: Option[SSEDescription] = Option(self.sseDescription)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSourceTableFeatureDetailsOps {

  implicit def toSourceTableFeatureDetailsBuilderOps(
      v: SourceTableFeatureDetails.Builder
  ): SourceTableFeatureDetailsBuilderOps = new SourceTableFeatureDetailsBuilderOps(v)

  implicit def toSourceTableFeatureDetailsOps(v: SourceTableFeatureDetails): SourceTableFeatureDetailsOps =
    new SourceTableFeatureDetailsOps(v)

}
