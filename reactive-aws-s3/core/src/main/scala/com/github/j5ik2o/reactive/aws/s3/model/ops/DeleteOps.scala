// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBuilderOps(val self: Delete.Builder) extends AnyVal {

  final def objectsAsScala(value: Option[Seq[ObjectIdentifier]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.objects(v.asJava)
    } // Seq[ObjectIdentifier]
  }

  final def quietAsScala(value: Option[Boolean]): Delete.Builder = {
    value.fold(self) { v =>
      self.quiet(v)
    }
  } // Boolean

}

final class DeleteOps(val self: Delete) extends AnyVal {

  final def objectsAsScala: Option[Seq[ObjectIdentifier]] = Option(self.objects).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  } // Seq[ObjectIdentifier]

  final def quietAsScala: Option[Boolean] = Option(self.quiet) // Boolean

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOps {

  implicit def toDeleteBuilderOps(v: Delete.Builder): DeleteBuilderOps = new DeleteBuilderOps(v)

  implicit def toDeleteOps(v: Delete): DeleteOps = new DeleteOps(v)

}
