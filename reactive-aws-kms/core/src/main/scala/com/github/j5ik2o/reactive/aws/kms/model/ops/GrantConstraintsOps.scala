// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GrantConstraintsBuilderOps(val self: GrantConstraints.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextSubsetAsScala(value: Option[Map[String, String]]): GrantConstraints.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionContextSubset(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextEqualsAsScala(value: Option[Map[String, String]]): GrantConstraints.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.encryptionContextEquals(v.asJava)
    }
  }

}

final class GrantConstraintsOps(val self: GrantConstraints) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextSubsetAsScala: Option[Map[String, String]] = Option(self.encryptionContextSubset).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def encryptionContextEqualsAsScala: Option[Map[String, String]] = Option(self.encryptionContextEquals).map {
    v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGrantConstraintsOps {

  implicit def toGrantConstraintsBuilderOps(v: GrantConstraints.Builder): GrantConstraintsBuilderOps =
    new GrantConstraintsBuilderOps(v)

  implicit def toGrantConstraintsOps(v: GrantConstraints): GrantConstraintsOps = new GrantConstraintsOps(v)

}
