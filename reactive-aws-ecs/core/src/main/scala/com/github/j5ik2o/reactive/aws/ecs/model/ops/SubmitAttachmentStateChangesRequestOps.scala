// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class SubmitAttachmentStateChangesRequestBuilderOps(val self: SubmitAttachmentStateChangesRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala(value: Option[String]): SubmitAttachmentStateChangesRequest.Builder = {
    value.fold(self) { v => self.cluster(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala(
      value: Option[Seq[AttachmentStateChange]]
  ): SubmitAttachmentStateChangesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attachments(v.asJava)
    }
  }

}

final class SubmitAttachmentStateChangesRequestOps(val self: SubmitAttachmentStateChangesRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterAsScala: Option[String] = Option(self.cluster)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attachmentsAsScala: Option[Seq[AttachmentStateChange]] =
    Option(self.attachments).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToSubmitAttachmentStateChangesRequestOps {

  implicit def toSubmitAttachmentStateChangesRequestBuilderOps(
      v: SubmitAttachmentStateChangesRequest.Builder
  ): SubmitAttachmentStateChangesRequestBuilderOps = new SubmitAttachmentStateChangesRequestBuilderOps(v)

  implicit def toSubmitAttachmentStateChangesRequestOps(
      v: SubmitAttachmentStateChangesRequest
  ): SubmitAttachmentStateChangesRequestOps = new SubmitAttachmentStateChangesRequestOps(v)

}
