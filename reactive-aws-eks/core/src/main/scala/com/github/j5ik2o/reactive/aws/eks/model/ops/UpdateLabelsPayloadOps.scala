// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateLabelsPayloadBuilderOps(val self: UpdateLabelsPayload.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addOrUpdateLabelsAsScala(value: Option[Map[String, String]]): UpdateLabelsPayload.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.addOrUpdateLabels(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeLabelsAsScala(value: Option[Seq[String]]): UpdateLabelsPayload.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.removeLabels(v.asJava)
    }
  }

}

final class UpdateLabelsPayloadOps(val self: UpdateLabelsPayload) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def addOrUpdateLabelsAsScala: Option[Map[String, String]] =
    Option(self.addOrUpdateLabels).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def removeLabelsAsScala: Option[Seq[String]] =
    Option(self.removeLabels).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateLabelsPayloadOps {

  implicit def toUpdateLabelsPayloadBuilderOps(v: UpdateLabelsPayload.Builder): UpdateLabelsPayloadBuilderOps =
    new UpdateLabelsPayloadBuilderOps(v)

  implicit def toUpdateLabelsPayloadOps(v: UpdateLabelsPayload): UpdateLabelsPayloadOps = new UpdateLabelsPayloadOps(v)

}
