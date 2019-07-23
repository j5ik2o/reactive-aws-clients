// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GrantListEntryBuilderOps(val self: GrantListEntry.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.grantId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala(value: Option[java.time.Instant]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteePrincipalAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.granteePrincipal(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retiringPrincipalAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.retiringPrincipal(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuingAccountAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.issuingAccount(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationsAsScala(value: Option[Seq[GrantOperation]]): GrantListEntry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.operations(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def constraintsAsScala(value: Option[GrantConstraints]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.constraints(v)
    }
  }

}

final class GrantListEntryOps(val self: GrantListEntry) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def keyIdAsScala: Option[String] = Option(self.keyId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def grantIdAsScala: Option[String] = Option(self.grantId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nameAsScala: Option[String] = Option(self.name)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def granteePrincipalAsScala: Option[String] = Option(self.granteePrincipal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def retiringPrincipalAsScala: Option[String] = Option(self.retiringPrincipal)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def issuingAccountAsScala: Option[String] = Option(self.issuingAccount)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def operationsAsScala: Option[Seq[GrantOperation]] = Option(self.operations).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def constraintsAsScala: Option[GrantConstraints] = Option(self.constraints)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGrantListEntryOps {

  implicit def toGrantListEntryBuilderOps(v: GrantListEntry.Builder): GrantListEntryBuilderOps =
    new GrantListEntryBuilderOps(v)

  implicit def toGrantListEntryOps(v: GrantListEntry): GrantListEntryOps = new GrantListEntryOps(v)

}
