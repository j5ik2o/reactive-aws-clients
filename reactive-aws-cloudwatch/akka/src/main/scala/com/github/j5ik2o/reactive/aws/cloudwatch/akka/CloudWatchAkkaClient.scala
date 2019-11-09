// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatch.akka

import akka.NotUsed
import akka.stream.scaladsl.{ Flow, Source }
import com.github.j5ik2o.reactive.aws.cloudwatch.CloudWatchAsyncClient
import software.amazon.awssdk.services.cloudwatch.model._

object CloudWatchAkkaClient {

  def apply(asyncClient: CloudWatchAsyncClient): CloudWatchAkkaClient = new CloudWatchAkkaClient {
    override val underlying: CloudWatchAsyncClient = asyncClient
  }

  val DefaultParallelism: Int = 1

}

trait CloudWatchAkkaClient {

  import CloudWatchAkkaClient._

  val underlying: CloudWatchAsyncClient

  def deleteAlarmsSource(
      deleteAlarmsRequest: DeleteAlarmsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteAlarmsResponse, NotUsed] =
    Source.single(deleteAlarmsRequest).via(deleteAlarmsFlow(parallelism))

  def deleteAlarmsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteAlarmsRequest, DeleteAlarmsResponse, NotUsed] =
    Flow[DeleteAlarmsRequest].mapAsync(parallelism) { deleteAlarmsRequest =>
      underlying.deleteAlarms(deleteAlarmsRequest)
    }

  def deleteAnomalyDetectorSource(
      deleteAnomalyDetectorRequest: DeleteAnomalyDetectorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteAnomalyDetectorResponse, NotUsed] =
    Source.single(deleteAnomalyDetectorRequest).via(deleteAnomalyDetectorFlow(parallelism))

  def deleteAnomalyDetectorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteAnomalyDetectorRequest, DeleteAnomalyDetectorResponse, NotUsed] =
    Flow[DeleteAnomalyDetectorRequest].mapAsync(parallelism) { deleteAnomalyDetectorRequest =>
      underlying.deleteAnomalyDetector(deleteAnomalyDetectorRequest)
    }

  def deleteDashboardsSource(
      deleteDashboardsRequest: DeleteDashboardsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DeleteDashboardsResponse, NotUsed] =
    Source.single(deleteDashboardsRequest).via(deleteDashboardsFlow(parallelism))

  def deleteDashboardsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DeleteDashboardsRequest, DeleteDashboardsResponse, NotUsed] =
    Flow[DeleteDashboardsRequest].mapAsync(parallelism) { deleteDashboardsRequest =>
      underlying.deleteDashboards(deleteDashboardsRequest)
    }

  def describeAlarmHistorySource(
      describeAlarmHistoryRequest: DescribeAlarmHistoryRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAlarmHistoryResponse, NotUsed] =
    Source.single(describeAlarmHistoryRequest).via(describeAlarmHistoryFlow(parallelism))

  def describeAlarmHistoryFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAlarmHistoryRequest, DescribeAlarmHistoryResponse, NotUsed] =
    Flow[DescribeAlarmHistoryRequest].mapAsync(parallelism) { describeAlarmHistoryRequest =>
      underlying.describeAlarmHistory(describeAlarmHistoryRequest)
    }

  def describeAlarmHistorySource(): Source[DescribeAlarmHistoryResponse, NotUsed] =
    Source.fromFuture(underlying.describeAlarmHistory())

  def describeAlarmHistoryPaginatorSource: Source[DescribeAlarmHistoryResponse, NotUsed] =
    Source.fromPublisher(underlying.describeAlarmHistoryPaginator())

  def describeAlarmHistoryPaginatorFlow: Flow[DescribeAlarmHistoryRequest, DescribeAlarmHistoryResponse, NotUsed] =
    Flow[DescribeAlarmHistoryRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeAlarmHistoryPaginator(request))
    }

  def describeAlarmsSource(
      describeAlarmsRequest: DescribeAlarmsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAlarmsResponse, NotUsed] =
    Source.single(describeAlarmsRequest).via(describeAlarmsFlow(parallelism))

  def describeAlarmsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAlarmsRequest, DescribeAlarmsResponse, NotUsed] =
    Flow[DescribeAlarmsRequest].mapAsync(parallelism) { describeAlarmsRequest =>
      underlying.describeAlarms(describeAlarmsRequest)
    }

  def describeAlarmsSource(): Source[DescribeAlarmsResponse, NotUsed] =
    Source.fromFuture(underlying.describeAlarms())

  def describeAlarmsForMetricSource(
      describeAlarmsForMetricRequest: DescribeAlarmsForMetricRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAlarmsForMetricResponse, NotUsed] =
    Source.single(describeAlarmsForMetricRequest).via(describeAlarmsForMetricFlow(parallelism))

  def describeAlarmsForMetricFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAlarmsForMetricRequest, DescribeAlarmsForMetricResponse, NotUsed] =
    Flow[DescribeAlarmsForMetricRequest].mapAsync(parallelism) { describeAlarmsForMetricRequest =>
      underlying.describeAlarmsForMetric(describeAlarmsForMetricRequest)
    }

  def describeAlarmsPaginatorSource: Source[DescribeAlarmsResponse, NotUsed] =
    Source.fromPublisher(underlying.describeAlarmsPaginator())

  def describeAlarmsPaginatorFlow: Flow[DescribeAlarmsRequest, DescribeAlarmsResponse, NotUsed] =
    Flow[DescribeAlarmsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.describeAlarmsPaginator(request))
    }

  def describeAnomalyDetectorsSource(
      describeAnomalyDetectorsRequest: DescribeAnomalyDetectorsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DescribeAnomalyDetectorsResponse, NotUsed] =
    Source.single(describeAnomalyDetectorsRequest).via(describeAnomalyDetectorsFlow(parallelism))

  def describeAnomalyDetectorsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DescribeAnomalyDetectorsRequest, DescribeAnomalyDetectorsResponse, NotUsed] =
    Flow[DescribeAnomalyDetectorsRequest].mapAsync(parallelism) { describeAnomalyDetectorsRequest =>
      underlying.describeAnomalyDetectors(describeAnomalyDetectorsRequest)
    }

  def disableAlarmActionsSource(
      disableAlarmActionsRequest: DisableAlarmActionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[DisableAlarmActionsResponse, NotUsed] =
    Source.single(disableAlarmActionsRequest).via(disableAlarmActionsFlow(parallelism))

  def disableAlarmActionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[DisableAlarmActionsRequest, DisableAlarmActionsResponse, NotUsed] =
    Flow[DisableAlarmActionsRequest].mapAsync(parallelism) { disableAlarmActionsRequest =>
      underlying.disableAlarmActions(disableAlarmActionsRequest)
    }

  def enableAlarmActionsSource(
      enableAlarmActionsRequest: EnableAlarmActionsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[EnableAlarmActionsResponse, NotUsed] =
    Source.single(enableAlarmActionsRequest).via(enableAlarmActionsFlow(parallelism))

  def enableAlarmActionsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[EnableAlarmActionsRequest, EnableAlarmActionsResponse, NotUsed] =
    Flow[EnableAlarmActionsRequest].mapAsync(parallelism) { enableAlarmActionsRequest =>
      underlying.enableAlarmActions(enableAlarmActionsRequest)
    }

  def getDashboardSource(
      getDashboardRequest: GetDashboardRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetDashboardResponse, NotUsed] =
    Source.single(getDashboardRequest).via(getDashboardFlow(parallelism))

  def getDashboardFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetDashboardRequest, GetDashboardResponse, NotUsed] =
    Flow[GetDashboardRequest].mapAsync(parallelism) { getDashboardRequest =>
      underlying.getDashboard(getDashboardRequest)
    }

  def getMetricDataSource(
      getMetricDataRequest: GetMetricDataRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetMetricDataResponse, NotUsed] =
    Source.single(getMetricDataRequest).via(getMetricDataFlow(parallelism))

  def getMetricDataFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetMetricDataRequest, GetMetricDataResponse, NotUsed] =
    Flow[GetMetricDataRequest].mapAsync(parallelism) { getMetricDataRequest =>
      underlying.getMetricData(getMetricDataRequest)
    }

  def getMetricDataPaginatorFlow: Flow[GetMetricDataRequest, GetMetricDataResponse, NotUsed] =
    Flow[GetMetricDataRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.getMetricDataPaginator(request))
    }

  def getMetricStatisticsSource(
      getMetricStatisticsRequest: GetMetricStatisticsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetMetricStatisticsResponse, NotUsed] =
    Source.single(getMetricStatisticsRequest).via(getMetricStatisticsFlow(parallelism))

  def getMetricStatisticsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetMetricStatisticsRequest, GetMetricStatisticsResponse, NotUsed] =
    Flow[GetMetricStatisticsRequest].mapAsync(parallelism) { getMetricStatisticsRequest =>
      underlying.getMetricStatistics(getMetricStatisticsRequest)
    }

  def getMetricWidgetImageSource(
      getMetricWidgetImageRequest: GetMetricWidgetImageRequest,
      parallelism: Int = DefaultParallelism
  ): Source[GetMetricWidgetImageResponse, NotUsed] =
    Source.single(getMetricWidgetImageRequest).via(getMetricWidgetImageFlow(parallelism))

  def getMetricWidgetImageFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[GetMetricWidgetImageRequest, GetMetricWidgetImageResponse, NotUsed] =
    Flow[GetMetricWidgetImageRequest].mapAsync(parallelism) { getMetricWidgetImageRequest =>
      underlying.getMetricWidgetImage(getMetricWidgetImageRequest)
    }

  def listDashboardsSource(
      listDashboardsRequest: ListDashboardsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListDashboardsResponse, NotUsed] =
    Source.single(listDashboardsRequest).via(listDashboardsFlow(parallelism))

  def listDashboardsFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListDashboardsRequest, ListDashboardsResponse, NotUsed] =
    Flow[ListDashboardsRequest].mapAsync(parallelism) { listDashboardsRequest =>
      underlying.listDashboards(listDashboardsRequest)
    }

  def listDashboardsSource(): Source[ListDashboardsResponse, NotUsed] =
    Source.fromFuture(underlying.listDashboards())

  def listDashboardsPaginatorSource: Source[ListDashboardsResponse, NotUsed] =
    Source.fromPublisher(underlying.listDashboardsPaginator())

  def listDashboardsPaginatorFlow: Flow[ListDashboardsRequest, ListDashboardsResponse, NotUsed] =
    Flow[ListDashboardsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listDashboardsPaginator(request))
    }

  def listMetricsSource(
      listMetricsRequest: ListMetricsRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListMetricsResponse, NotUsed] =
    Source.single(listMetricsRequest).via(listMetricsFlow(parallelism))

  def listMetricsFlow(parallelism: Int = DefaultParallelism): Flow[ListMetricsRequest, ListMetricsResponse, NotUsed] =
    Flow[ListMetricsRequest].mapAsync(parallelism) { listMetricsRequest =>
      underlying.listMetrics(listMetricsRequest)
    }

  def listMetricsSource(): Source[ListMetricsResponse, NotUsed] =
    Source.fromFuture(underlying.listMetrics())

  def listMetricsPaginatorSource: Source[ListMetricsResponse, NotUsed] =
    Source.fromPublisher(underlying.listMetricsPaginator())

  def listMetricsPaginatorFlow: Flow[ListMetricsRequest, ListMetricsResponse, NotUsed] =
    Flow[ListMetricsRequest].flatMapConcat { request =>
      Source.fromPublisher(underlying.listMetricsPaginator(request))
    }

  def listTagsForResourceSource(
      listTagsForResourceRequest: ListTagsForResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[ListTagsForResourceResponse, NotUsed] =
    Source.single(listTagsForResourceRequest).via(listTagsForResourceFlow(parallelism))

  def listTagsForResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[ListTagsForResourceRequest, ListTagsForResourceResponse, NotUsed] =
    Flow[ListTagsForResourceRequest].mapAsync(parallelism) { listTagsForResourceRequest =>
      underlying.listTagsForResource(listTagsForResourceRequest)
    }

  def putAnomalyDetectorSource(
      putAnomalyDetectorRequest: PutAnomalyDetectorRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutAnomalyDetectorResponse, NotUsed] =
    Source.single(putAnomalyDetectorRequest).via(putAnomalyDetectorFlow(parallelism))

  def putAnomalyDetectorFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutAnomalyDetectorRequest, PutAnomalyDetectorResponse, NotUsed] =
    Flow[PutAnomalyDetectorRequest].mapAsync(parallelism) { putAnomalyDetectorRequest =>
      underlying.putAnomalyDetector(putAnomalyDetectorRequest)
    }

  def putDashboardSource(
      putDashboardRequest: PutDashboardRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutDashboardResponse, NotUsed] =
    Source.single(putDashboardRequest).via(putDashboardFlow(parallelism))

  def putDashboardFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutDashboardRequest, PutDashboardResponse, NotUsed] =
    Flow[PutDashboardRequest].mapAsync(parallelism) { putDashboardRequest =>
      underlying.putDashboard(putDashboardRequest)
    }

  def putMetricAlarmSource(
      putMetricAlarmRequest: PutMetricAlarmRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutMetricAlarmResponse, NotUsed] =
    Source.single(putMetricAlarmRequest).via(putMetricAlarmFlow(parallelism))

  def putMetricAlarmFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutMetricAlarmRequest, PutMetricAlarmResponse, NotUsed] =
    Flow[PutMetricAlarmRequest].mapAsync(parallelism) { putMetricAlarmRequest =>
      underlying.putMetricAlarm(putMetricAlarmRequest)
    }

  def putMetricDataSource(
      putMetricDataRequest: PutMetricDataRequest,
      parallelism: Int = DefaultParallelism
  ): Source[PutMetricDataResponse, NotUsed] =
    Source.single(putMetricDataRequest).via(putMetricDataFlow(parallelism))

  def putMetricDataFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[PutMetricDataRequest, PutMetricDataResponse, NotUsed] =
    Flow[PutMetricDataRequest].mapAsync(parallelism) { putMetricDataRequest =>
      underlying.putMetricData(putMetricDataRequest)
    }

  def setAlarmStateSource(
      setAlarmStateRequest: SetAlarmStateRequest,
      parallelism: Int = DefaultParallelism
  ): Source[SetAlarmStateResponse, NotUsed] =
    Source.single(setAlarmStateRequest).via(setAlarmStateFlow(parallelism))

  def setAlarmStateFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[SetAlarmStateRequest, SetAlarmStateResponse, NotUsed] =
    Flow[SetAlarmStateRequest].mapAsync(parallelism) { setAlarmStateRequest =>
      underlying.setAlarmState(setAlarmStateRequest)
    }

  def tagResourceSource(
      tagResourceRequest: TagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[TagResourceResponse, NotUsed] =
    Source.single(tagResourceRequest).via(tagResourceFlow(parallelism))

  def tagResourceFlow(parallelism: Int = DefaultParallelism): Flow[TagResourceRequest, TagResourceResponse, NotUsed] =
    Flow[TagResourceRequest].mapAsync(parallelism) { tagResourceRequest =>
      underlying.tagResource(tagResourceRequest)
    }

  def untagResourceSource(
      untagResourceRequest: UntagResourceRequest,
      parallelism: Int = DefaultParallelism
  ): Source[UntagResourceResponse, NotUsed] =
    Source.single(untagResourceRequest).via(untagResourceFlow(parallelism))

  def untagResourceFlow(
      parallelism: Int = DefaultParallelism
  ): Flow[UntagResourceRequest, UntagResourceResponse, NotUsed] =
    Flow[UntagResourceRequest].mapAsync(parallelism) { untagResourceRequest =>
      underlying.untagResource(untagResourceRequest)
    }

}
