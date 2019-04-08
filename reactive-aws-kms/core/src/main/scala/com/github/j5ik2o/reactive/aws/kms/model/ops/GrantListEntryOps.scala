// Auto-Generated
package com.github.j5ik2o.reactive.aws.kms.model.ops

import software.amazon.awssdk.services.kms.model._

final class GrantListEntryBuilderOps(val self: GrantListEntry.Builder) extends AnyVal {

  final def keyIdAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.keyId(v)
    }
  }

  final def grantIdAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.grantId(v)
    }
  }

  final def nameAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.name(v)
    }
  }

  final def creationDateAsScala(value: Option[java.time.Instant]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.creationDate(v)
    }
  }

  final def granteePrincipalAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.granteePrincipal(v)
    }
  }

  final def retiringPrincipalAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.retiringPrincipal(v)
    }
  }

  final def issuingAccountAsScala(value: Option[String]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.issuingAccount(v)
    }
  }

  final def operationsAsScala(value: Option[Seq[GrantOperation]]): GrantListEntry.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.operations(v.asJava)
    }
  }

  final def constraintsAsScala(value: Option[GrantConstraints]): GrantListEntry.Builder = {
    value.fold(self) { v =>
      self.constraints(v)
    }
  }

}

final class GrantListEntryOps(val self: GrantListEntry) extends AnyVal {

  final def keyIdAsScala: Option[String] = Option(self.keyId)

  final def grantIdAsScala: Option[String] = Option(self.grantId)

  final def nameAsScala: Option[String] = Option(self.name)

  final def creationDateAsScala: Option[java.time.Instant] = Option(self.creationDate)

  final def granteePrincipalAsScala: Option[String] = Option(self.granteePrincipal)

  final def retiringPrincipalAsScala: Option[String] = Option(self.retiringPrincipal)

  final def issuingAccountAsScala: Option[String] = Option(self.issuingAccount)

  final def operationsAsScala: Option[Seq[GrantOperation]] = Option(self.operations).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def constraintsAsScala: Option[GrantConstraints] = Option(self.constraints)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGrantListEntryOps {

  implicit def toGrantListEntryBuilderOps(v: GrantListEntry.Builder): GrantListEntryBuilderOps =
    new GrantListEntryBuilderOps(v)

  implicit def toGrantListEntryOps(v: GrantListEntry): GrantListEntryOps = new GrantListEntryOps(v)

}
