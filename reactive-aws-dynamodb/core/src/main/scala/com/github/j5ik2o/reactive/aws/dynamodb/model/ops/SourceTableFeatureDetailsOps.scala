// Auto-Generated
package com.github.j5ik2o.reactive.aws.dynamodb.model.ops

import software.amazon.awssdk.services.dynamodb.model._

final class SourceTableFeatureDetailsBuilderOps(val self: SourceTableFeatureDetails.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexesAsScala(
      value: Option[Seq[LocalSecondaryIndexInfo]]
  ): SourceTableFeatureDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.localSecondaryIndexes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala(
      value: Option[Seq[GlobalSecondaryIndexInfo]]
  ): SourceTableFeatureDetails.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.globalSecondaryIndexes(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamDescriptionAsScala(value: Option[StreamSpecification]): SourceTableFeatureDetails.Builder = {
    value.fold(self) { v =>
      self.streamDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeToLiveDescriptionAsScala(value: Option[TimeToLiveDescription]): SourceTableFeatureDetails.Builder = {
    value.fold(self) { v =>
      self.timeToLiveDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def sseDescriptionAsScala(value: Option[SSEDescription]): SourceTableFeatureDetails.Builder = {
    value.fold(self) { v =>
      self.sseDescription(v)
    }
  }

}

final class SourceTableFeatureDetailsOps(val self: SourceTableFeatureDetails) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def localSecondaryIndexesAsScala: Option[Seq[LocalSecondaryIndexInfo]] =
    Option(self.localSecondaryIndexes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def globalSecondaryIndexesAsScala: Option[Seq[GlobalSecondaryIndexInfo]] =
    Option(self.globalSecondaryIndexes).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def streamDescriptionAsScala: Option[StreamSpecification] = Option(self.streamDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def timeToLiveDescriptionAsScala: Option[TimeToLiveDescription] = Option(self.timeToLiveDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
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
