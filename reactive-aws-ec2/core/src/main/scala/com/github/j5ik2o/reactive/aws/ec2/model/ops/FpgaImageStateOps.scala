// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class FpgaImageStateBuilderOps(val self: FpgaImageState.Builder) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala(value: Option[FpgaImageStateCode]): FpgaImageState.Builder = {
            value.fold(self){ v => self.code(v) }
            } 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala(value: Option[String]): FpgaImageState.Builder = {
            value.fold(self){ v => self.message(v) }
            } 


}

final class FpgaImageStateOps(val self: FpgaImageState) extends AnyVal {

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def codeAsScala: Option[FpgaImageStateCode] = Option(self.code) 

    @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
            final def messageAsScala: Option[String] = Option(self.message) 


}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFpgaImageStateOps {

implicit def toFpgaImageStateBuilderOps(v: FpgaImageState.Builder): FpgaImageStateBuilderOps = new FpgaImageStateBuilderOps(v)

implicit def toFpgaImageStateOps(v: FpgaImageState): FpgaImageStateOps = new FpgaImageStateOps(v)

}

