// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class AccountAttributeValueBuilderOps(val self: AccountAttributeValue.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeValueAsScala(value: Option[String]): AccountAttributeValue.Builder = {
            value.fold(self){ v => self.attributeValue(v) }
            } 


}

final class AccountAttributeValueOps(val self: AccountAttributeValue) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def attributeValueAsScala: Option[String] = Option(self.attributeValue) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToAccountAttributeValueOps {

implicit def toAccountAttributeValueBuilderOps(v: AccountAttributeValue.Builder): AccountAttributeValueBuilderOps = new AccountAttributeValueBuilderOps(v)

implicit def toAccountAttributeValueOps(v: AccountAttributeValue): AccountAttributeValueOps = new AccountAttributeValueOps(v)

}

