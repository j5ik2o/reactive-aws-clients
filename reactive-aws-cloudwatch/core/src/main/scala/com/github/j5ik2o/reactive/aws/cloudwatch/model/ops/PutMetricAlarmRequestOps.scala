// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.model.ops

import software.amazon.awssdk.services.cloudwatch.model._

final class PutMetricAlarmRequestBuilderOps(val self: PutMetricAlarmRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.alarmName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmDescriptionAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.alarmDescription(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsEnabledAsScala(value: Option[Boolean]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.actionsEnabled(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.okActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.alarmActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insufficientDataActionsAsScala(value: Option[Seq[String]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.insufficientDataActions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.metricName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.namespace(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticAsScala(value: Option[Statistic]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.statistic(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extendedStatisticAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.extendedStatistic(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala(value: Option[Seq[Dimension]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.dimensions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.period(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala(value: Option[StandardUnit]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.unit(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def evaluationPeriodsAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.evaluationPeriods(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def datapointsToAlarmAsScala(value: Option[Int]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.datapointsToAlarm(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def thresholdAsScala(value: Option[Double]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.threshold(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def comparisonOperatorAsScala(value: Option[ComparisonOperator]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.comparisonOperator(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def treatMissingDataAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.treatMissingData(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def evaluateLowSampleCountPercentileAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.evaluateLowSampleCountPercentile(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricsAsScala(value: Option[Seq[MetricDataQuery]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.metrics(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Seq[Tag]]): PutMetricAlarmRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def thresholdMetricIdAsScala(value: Option[String]): PutMetricAlarmRequest.Builder = {
    value.fold(self) { v =>
      self.thresholdMetricId(v)
    }
  }

}

final class PutMetricAlarmRequestOps(val self: PutMetricAlarmRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmNameAsScala: Option[String] = Option(self.alarmName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmDescriptionAsScala: Option[String] = Option(self.alarmDescription)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def actionsEnabledAsScala: Option[Boolean] = Option(self.actionsEnabled)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def okActionsAsScala: Option[Seq[String]] = Option(self.okActions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def alarmActionsAsScala: Option[Seq[String]] = Option(self.alarmActions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def insufficientDataActionsAsScala: Option[Seq[String]] = Option(self.insufficientDataActions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricNameAsScala: Option[String] = Option(self.metricName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def namespaceAsScala: Option[String] = Option(self.namespace)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statisticAsScala: Option[Statistic] = Option(self.statistic)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def extendedStatisticAsScala: Option[String] = Option(self.extendedStatistic)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def dimensionsAsScala: Option[Seq[Dimension]] = Option(self.dimensions).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def periodAsScala: Option[Int] = Option(self.period)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def unitAsScala: Option[StandardUnit] = Option(self.unit)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def evaluationPeriodsAsScala: Option[Int] = Option(self.evaluationPeriods)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def datapointsToAlarmAsScala: Option[Int] = Option(self.datapointsToAlarm)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def thresholdAsScala: Option[Double] = Option(self.threshold)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def comparisonOperatorAsScala: Option[ComparisonOperator] = Option(self.comparisonOperator)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def treatMissingDataAsScala: Option[String] = Option(self.treatMissingData)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def evaluateLowSampleCountPercentileAsScala: Option[String] = Option(self.evaluateLowSampleCountPercentile)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def metricsAsScala: Option[Seq[MetricDataQuery]] = Option(self.metrics).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Seq[Tag]] = Option(self.tags).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def thresholdMetricIdAsScala: Option[String] = Option(self.thresholdMetricId)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPutMetricAlarmRequestOps {

  implicit def toPutMetricAlarmRequestBuilderOps(v: PutMetricAlarmRequest.Builder): PutMetricAlarmRequestBuilderOps =
    new PutMetricAlarmRequestBuilderOps(v)

  implicit def toPutMetricAlarmRequestOps(v: PutMetricAlarmRequest): PutMetricAlarmRequestOps =
    new PutMetricAlarmRequestOps(v)

}
