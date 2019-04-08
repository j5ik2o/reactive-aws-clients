// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class StatusCodesBuilderOps(val self: StatusCodes.Builder) extends AnyVal {

  final def status2xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status2xx(v)
    }
  } // Int

  final def status3xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status3xx(v)
    }
  } // Int

  final def status4xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status4xx(v)
    }
  } // Int

  final def status5xxAsScala(value: Option[Int]): StatusCodes.Builder = {
    value.fold(self) { v =>
      self.status5xx(v)
    }
  } // Int

}

final class StatusCodesOps(val self: StatusCodes) extends AnyVal {

  final def status2xxAsScala: Option[Int] = Option(self.status2xx) // Int

  final def status3xxAsScala: Option[Int] = Option(self.status3xx) // Int

  final def status4xxAsScala: Option[Int] = Option(self.status4xx) // Int

  final def status5xxAsScala: Option[Int] = Option(self.status5xx) // Int

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStatusCodesOps {

  implicit def toStatusCodesBuilderOps(v: StatusCodes.Builder): StatusCodesBuilderOps = new StatusCodesBuilderOps(v)

  implicit def toStatusCodesOps(v: StatusCodes): StatusCodesOps = new StatusCodesOps(v)

}
