// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class UnsuccessfulInstanceCreditSpecificationItemErrorBuilderOps(val self: UnsuccessfulInstanceCreditSpecificationItemError.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[UnsuccessfulInstanceCreditSpecificationErrorCode]): UnsuccessfulInstanceCreditSpecificationItemError.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): UnsuccessfulInstanceCreditSpecificationItemError.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class UnsuccessfulInstanceCreditSpecificationItemErrorOps(val self: UnsuccessfulInstanceCreditSpecificationItemError) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[UnsuccessfulInstanceCreditSpecificationErrorCode] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToUnsuccessfulInstanceCreditSpecificationItemErrorOps {

implicit def toUnsuccessfulInstanceCreditSpecificationItemErrorBuilderOps(v: UnsuccessfulInstanceCreditSpecificationItemError.Builder): UnsuccessfulInstanceCreditSpecificationItemErrorBuilderOps = new UnsuccessfulInstanceCreditSpecificationItemErrorBuilderOps(v)

implicit def toUnsuccessfulInstanceCreditSpecificationItemErrorOps(v: UnsuccessfulInstanceCreditSpecificationItemError): UnsuccessfulInstanceCreditSpecificationItemErrorOps = new UnsuccessfulInstanceCreditSpecificationItemErrorOps(v)

}

