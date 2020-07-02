// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class LastErrorBuilderOps(val self: LastError.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala(value: Option[String]): LastError.Builder = {
    value.fold(self) { v => self.message(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala(value: Option[String]): LastError.Builder = {
    value.fold(self) { v => self.code(v) }
  }

}

final class LastErrorOps(val self: LastError) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def messageAsScala: Option[String] = Option(self.message)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def codeAsScala: Option[String] = Option(self.code)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToLastErrorOps {

  implicit def toLastErrorBuilderOps(v: LastError.Builder): LastErrorBuilderOps = new LastErrorBuilderOps(v)

  implicit def toLastErrorOps(v: LastError): LastErrorOps = new LastErrorOps(v)

}
