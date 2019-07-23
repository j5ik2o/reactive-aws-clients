// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class CreateGrantRequestBuilderOps(val self: CreateGrantRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): CreateGrantRequest.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteePrincipalAsScala(value: Option[String]): CreateGrantRequest.Builder = {
    value.fold(self) { v =>
      self.granteePrincipal(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retiringPrincipalAsScala(value: Option[String]): CreateGrantRequest.Builder = {
    value.fold(self) { v =>
      self.retiringPrincipal(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationsAsScala(value: Option[Seq[GrantOperation]]): CreateGrantRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.operations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def constraintsAsScala(value: Option[GrantConstraints]): CreateGrantRequest.Builder = {
    value.fold(self) { v =>
      self.constraints(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala(value: Option[Seq[String]]): CreateGrantRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.grantTokens(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): CreateGrantRequest.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

}

final class CreateGrantRequestOps(val self: CreateGrantRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteePrincipalAsScala: Option[String] = Option(self.granteePrincipal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retiringPrincipalAsScala: Option[String] = Option(self.retiringPrincipal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationsAsScala: Option[Seq[GrantOperation]] = Option(self.operations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def constraintsAsScala: Option[GrantConstraints] = Option(self.constraints)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantTokensAsScala: Option[Seq[String]] = Option(self.grantTokens).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCreateGrantRequestOps {

  implicit def toCreateGrantRequestBuilderOps(v: CreateGrantRequest.Builder): CreateGrantRequestBuilderOps =
    new CreateGrantRequestBuilderOps(v)

  implicit def toCreateGrantRequestOps(v: CreateGrantRequest): CreateGrantRequestOps = new CreateGrantRequestOps(v)

}
