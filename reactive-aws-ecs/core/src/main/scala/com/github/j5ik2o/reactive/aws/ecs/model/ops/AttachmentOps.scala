// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class AttachmentBuilderOps(val self: Attachment.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): Attachment.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def typeAsScala(value: Option[String]): Attachment.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def statusAsScala(value: Option[String]): Attachment.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def detailsAsScala(value: Option[Seq[KeyValuePair]]): Attachment.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.details(v.asJava)
    }
  }

}

final class AttachmentOps(val self: Attachment) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def typeAsScala: Option[String] = Option(self.`type`)

  final def statusAsScala: Option[String] = Option(self.status)

  final def detailsAsScala: Option[Seq[KeyValuePair]] = Option(self.details).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAttachmentOps {

  implicit def toAttachmentBuilderOps(v: Attachment.Builder): AttachmentBuilderOps = new AttachmentBuilderOps(v)

  implicit def toAttachmentOps(v: Attachment): AttachmentOps = new AttachmentOps(v)

}
