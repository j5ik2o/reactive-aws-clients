// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AccountAttributeBuilderOps(val self: AccountAttribute.Builder) extends AnyVal {

  final def attributeNameAsScala(value: Option[String]): AccountAttribute.Builder = {
    value.fold(self) { v =>
      self.attributeName(v)
    }
  }

  final def attributeValuesAsScala(value: Option[Seq[AccountAttributeValue]]): AccountAttribute.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.attributeValues(v.asJava)
    }
  }

}

final class AccountAttributeOps(val self: AccountAttribute) extends AnyVal {

  final def attributeNameAsScala: Option[String] = Option(self.attributeName)

  final def attributeValuesAsScala: Option[Seq[AccountAttributeValue]] = Option(self.attributeValues).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountAttributeOps {

  implicit def toAccountAttributeBuilderOps(v: AccountAttribute.Builder): AccountAttributeBuilderOps =
    new AccountAttributeBuilderOps(v)

  implicit def toAccountAttributeOps(v: AccountAttribute): AccountAttributeOps = new AccountAttributeOps(v)

}
