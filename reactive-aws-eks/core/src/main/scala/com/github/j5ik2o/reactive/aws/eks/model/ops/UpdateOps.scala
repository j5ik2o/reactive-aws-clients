// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class UpdateBuilderOps(val self: Update.Builder) extends AnyVal {

  final def idAsScala(value: Option[String]): Update.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  }

  final def statusAsScala(value: Option[UpdateStatus]): Update.Builder = {
    value.fold(self) { v =>
      self.status(v)
    }
  }

  final def typeAsScala(value: Option[UpdateType]): Update.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  }

  final def paramsAsScala(value: Option[Seq[UpdateParam]]): Update.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.params(v.asJava)
    }
  }

  final def createdAtAsScala(value: Option[java.time.Instant]): Update.Builder = {
    value.fold(self) { v =>
      self.createdAt(v)
    }
  }

  final def errorsAsScala(value: Option[Seq[ErrorDetail]]): Update.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.errors(v.asJava)
    }
  }

}

final class UpdateOps(val self: Update) extends AnyVal {

  final def idAsScala: Option[String] = Option(self.id)

  final def statusAsScala: Option[UpdateStatus] = Option(self.status)

  final def typeAsScala: Option[UpdateType] = Option(self.`type`)

  final def paramsAsScala: Option[Seq[UpdateParam]] = Option(self.params).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  final def errorsAsScala: Option[Seq[ErrorDetail]] = Option(self.errors).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUpdateOps {

  implicit def toUpdateBuilderOps(v: Update.Builder): UpdateBuilderOps = new UpdateBuilderOps(v)

  implicit def toUpdateOps(v: Update): UpdateOps = new UpdateOps(v)

}
