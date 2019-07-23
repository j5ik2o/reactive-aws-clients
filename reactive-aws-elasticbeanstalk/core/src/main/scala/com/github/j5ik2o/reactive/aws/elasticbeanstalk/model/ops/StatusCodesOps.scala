// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class StatusCodesBuilderOps(val self: StatusCodes.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status2xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status2xx(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status3xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status3xx(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status4xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status4xx(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status5xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status5xx(v)
    }
  }

}

final class StatusCodesOps(val self: StatusCodes) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status2xxAsScala: Option[Int] = Option(self.status2xx)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status3xxAsScala: Option[Int] = Option(self.status3xx)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status4xxAsScala: Option[Int] = Option(self.status4xx)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def status5xxAsScala: Option[Int] = Option(self.status5xx)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStatusCodesOps {

  implicit def toStatusCodesBuilderOps(v: StatusCodes.Builder): StatusCodesBuilderOps = new StatusCodesBuilderOps(v)

  implicit def toStatusCodesOps(v: StatusCodes): StatusCodesOps = new StatusCodesOps(v)

}
