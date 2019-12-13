// Auto-Generated
package com.github.j5ik2o.reactive.aws.rekognition.model.ops

import software.amazon.awssdk.services.rekognition.model._

final class HumanLoopDataAttributesBuilderOps(val self: HumanLoopDataAttributes.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentClassifiersAsScala(value: Option[Seq[ContentClassifier]]): HumanLoopDataAttributes.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.contentClassifiers(v.asJava)
    }
  }

}

final class HumanLoopDataAttributesOps(val self: HumanLoopDataAttributes) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def contentClassifiersAsScala: Option[Seq[ContentClassifier]] = Option(self.contentClassifiers).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToHumanLoopDataAttributesOps {

  implicit def toHumanLoopDataAttributesBuilderOps(
      v: HumanLoopDataAttributes.Builder
  ): HumanLoopDataAttributesBuilderOps = new HumanLoopDataAttributesBuilderOps(v)

  implicit def toHumanLoopDataAttributesOps(v: HumanLoopDataAttributes): HumanLoopDataAttributesOps =
    new HumanLoopDataAttributesOps(v)

}
