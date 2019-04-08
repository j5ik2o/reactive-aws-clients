// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class StatisticSetBuilderOps(val self: StatisticSet.Builder) extends AnyVal {

  final def sampleCountAsScala(value: Option[Double]): StatisticSet.Builder = {
    value.fold(self) { v =>
      self.sampleCount(v)
    }
  }

  final def sumAsScala(value: Option[Double]): StatisticSet.Builder = {
    value.fold(self) { v =>
      self.sum(v)
    }
  }

  final def minimumAsScala(value: Option[Double]): StatisticSet.Builder = {
    value.fold(self) { v =>
      self.minimum(v)
    }
  }

  final def maximumAsScala(value: Option[Double]): StatisticSet.Builder = {
    value.fold(self) { v =>
      self.maximum(v)
    }
  }

}

final class StatisticSetOps(val self: StatisticSet) extends AnyVal {

  final def sampleCountAsScala: Option[Double] = Option(self.sampleCount)

  final def sumAsScala: Option[Double] = Option(self.sum)

  final def minimumAsScala: Option[Double] = Option(self.minimum)

  final def maximumAsScala: Option[Double] = Option(self.maximum)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToStatisticSetOps {

  implicit def toStatisticSetBuilderOps(v: StatisticSet.Builder): StatisticSetBuilderOps = new StatisticSetBuilderOps(v)

  implicit def toStatisticSetOps(v: StatisticSet): StatisticSetOps = new StatisticSetOps(v)

}
