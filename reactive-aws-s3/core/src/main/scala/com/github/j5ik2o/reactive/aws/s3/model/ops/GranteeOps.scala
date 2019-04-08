// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class GranteeBuilderOps(val self: Grantee.Builder) extends AnyVal {

  final def displayNameAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v =>
      self.displayName(v)
    }
  } // String

  final def emailAddressAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v =>
      self.emailAddress(v)
    }
  } // String

  final def idAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v =>
      self.id(v)
    }
  } // String

  final def typeAsScala(value: Option[Type]): Grantee.Builder = {
    value.fold(self) { v =>
      self.`type`(v)
    }
  } // String

  final def uriAsScala(value: Option[String]): Grantee.Builder = {
    value.fold(self) { v =>
      self.uri(v)
    }
  } // String

}

final class GranteeOps(val self: Grantee) extends AnyVal {

  final def displayNameAsScala: Option[String] = Option(self.displayName) // String

  final def emailAddressAsScala: Option[String] = Option(self.emailAddress) // String

  final def idAsScala: Option[String] = Option(self.id) // String

  final def typeAsScala: Option[Type] = Option(self.`type`) // String

  final def uriAsScala: Option[String] = Option(self.uri) // String

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToGranteeOps {

  implicit def toGranteeBuilderOps(v: Grantee.Builder): GranteeBuilderOps = new GranteeBuilderOps(v)

  implicit def toGranteeOps(v: Grantee): GranteeOps = new GranteeOps(v)

}
