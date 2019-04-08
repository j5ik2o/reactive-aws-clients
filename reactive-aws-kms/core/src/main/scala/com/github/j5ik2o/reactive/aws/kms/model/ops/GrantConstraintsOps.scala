// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GrantConstraintsBuilderOps(val self: GrantConstraints.Builder) extends AnyVal {

  final def encryptionContextSubsetAsScala(value: Option[Map[String, String]]): GrantConstraints.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.encryptionContextSubset(v.asJava)
    }
  }

  final def encryptionContextEqualsAsScala(value: Option[Map[String, String]]): GrantConstraints.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.encryptionContextEquals(v.asJava)
    }
  }

}

final class GrantConstraintsOps(val self: GrantConstraints) extends AnyVal {

  final def encryptionContextSubsetAsScala: Option[Map[String, String]] = Option(self.encryptionContextSubset).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

  final def encryptionContextEqualsAsScala: Option[Map[String, String]] = Option(self.encryptionContextEquals).map {
    v =>
      import scala.collection.JavaConverters._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGrantConstraintsOps {

  implicit def toGrantConstraintsBuilderOps(v: GrantConstraints.Builder): GrantConstraintsBuilderOps =
    new GrantConstraintsBuilderOps(v)

  implicit def toGrantConstraintsOps(v: GrantConstraints): GrantConstraintsOps = new GrantConstraintsOps(v)

}
