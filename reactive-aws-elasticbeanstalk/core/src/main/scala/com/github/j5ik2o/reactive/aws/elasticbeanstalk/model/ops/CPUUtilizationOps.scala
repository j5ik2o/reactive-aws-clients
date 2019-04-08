// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class CPUUtilizationBuilderOps(val self: CPUUtilization.Builder) extends AnyVal {

  final def userAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.user(v)
    }
  } // Double

  final def niceAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.nice(v)
    }
  } // Double

  final def systemAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.system(v)
    }
  } // Double

  final def idleAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.idle(v)
    }
  } // Double

  final def ioWaitAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.ioWait(v)
    }
  } // Double

  final def irqAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.irq(v)
    }
  } // Double

  final def softIRQAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.softIRQ(v)
    }
  } // Double

  final def privilegedAsScala(value: Option[Double]): CPUUtilization.Builder = {
    value.fold(self) { v =>
      self.privileged(v)
    }
  } // Double

}

final class CPUUtilizationOps(val self: CPUUtilization) extends AnyVal {

  final def userAsScala: Option[Double] = Option(self.user) // Double

  final def niceAsScala: Option[Double] = Option(self.nice) // Double

  final def systemAsScala: Option[Double] = Option(self.system) // Double

  final def idleAsScala: Option[Double] = Option(self.idle) // Double

  final def ioWaitAsScala: Option[Double] = Option(self.ioWait) // Double

  final def irqAsScala: Option[Double] = Option(self.irq) // Double

  final def softIRQAsScala: Option[Double] = Option(self.softIRQ) // Double

  final def privilegedAsScala: Option[Double] = Option(self.privileged) // Double

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCPUUtilizationOps {

  implicit def toCPUUtilizationBuilderOps(v: CPUUtilization.Builder): CPUUtilizationBuilderOps =
    new CPUUtilizationBuilderOps(v)

  implicit def toCPUUtilizationOps(v: CPUUtilization): CPUUtilizationOps = new CPUUtilizationOps(v)

}
