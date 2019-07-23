// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class DeleteBuilderOps(val self: Delete.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectsAsScala(value: Option[Seq[ObjectIdentifier]]): Delete.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.objects(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quietAsScala(value: Option[Boolean]): Delete.Builder = {
    value.fold(self) { v =>
      self.quiet(v)
    }
  }

}

final class DeleteOps(val self: Delete) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def objectsAsScala: Option[Seq[ObjectIdentifier]] = Option(self.objects).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def quietAsScala: Option[Boolean] = Option(self.quiet)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDeleteOps {

  implicit def toDeleteBuilderOps(v: Delete.Builder): DeleteBuilderOps = new DeleteBuilderOps(v)

  implicit def toDeleteOps(v: Delete): DeleteOps = new DeleteOps(v)

}
